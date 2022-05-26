// Basic demo for readings from Adafruit SCD30
#include <Adafruit_SCD30.h>

Adafruit_SCD30  scd30;

const int dry = 595; // value for dry sensor
const int wet = 239; // value for wet sensor

void setup()
{ 
    Serial.begin(115200);
  while (!Serial) delay(10);     // will pause Zero, Leonardo, etc until serial console opens

  Serial.println("Initialize Sensor SCD 30 and Moil Sensor!");

  // Try to initialize!
  if (!scd30.begin()) {
    Serial.println("Failed to find SCD30 chip");
    while (1) { delay(10); }
  }
  Serial.println("SCD30 Found!");


  // if (!scd30.setMeasurementInterval(10)){
  //   Serial.println("Failed to set measurement interval");
  //   while(1){ delay(10);}
  // }
  Serial.print("Measurement Interval: "); 
  Serial.print(scd30.getMeasurementInterval()); 
  Serial.println(" seconds");
}


void loop()
{

  // Reads from Analog 0
  int sensorVal = analogRead(A0);

  // Sensor has a range of 239 to 595
  // We want to translate this to a scale or 0% to 100%
  int percentageHumididy = map(sensorVal, wet, dry, 100, 0); 
  Serial.print("Moilsensor Input A01: ");
  Serial.print(percentageHumididy);
  Serial.println("%");

  if (scd30.dataReady()){
    Serial.println("Data available SCD 30!");

    if (!scd30.read()){ Serial.println("Error reading sensor data"); return; }

    Serial.print("Temperature: ");
    Serial.print(scd30.temperature);
    Serial.println(" degrees C");
    
    Serial.print("Relative Humidity: ");
    Serial.print(scd30.relative_humidity);
    Serial.println(" %");
    
    Serial.print("CO2: ");
    Serial.print(scd30.CO2, 3);
    Serial.println(" ppm");
    Serial.println("");
  } else {
    //Serial.println("No data");
  }

  
  delay(10000);
  
}
