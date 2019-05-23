$psise.CurrentPowerShellTab.DisplayName = 'servicio-de-configuracion'
$psise.CurrentPowerShellTab.DisplayName = 'servicio-a'
$psise.CurrentPowerShellTab.DisplayName = 'servicio-b'
cd C:\_dev\_code\netec-dev\taller_microservicios\poc-spring-cloud-bus
# servicio-de-configuracion :2000
java -jar .\servicio-de-configuracion\target\servicio-de-configuracion-0.0.1-SNAPSHOT.jar
# servicio-a :9000
java -jar .\servicio-a\target\servicio-a-0.0.1-SNAPSHOT.jar
# servicio-b :9001
java -jar .\servicio-b\target\servicio-b-0.0.1-SNAPSHOT.jar