int val;
int LED = 13;
void setup()
{
  Serial.begin(9600);
  pinMode(LED, OUTPUT);
  digitalWrite(LED, HIGH);
}

void loop()
{
  if (Serial.available())
  {
    while(1){
    Serial.print("Hello");
    }
  }
}
