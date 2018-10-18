# 1819_5ahif_nvs_microprofile_microproject
Erste Microprofile-Programm für Thorntail

## Aufbau
### Thorntail
* Es wird ein Derby Driver verwendet um auf die DB zugreifen und zu können, und nur die nötigsten Thorntail Libraries um eine möglichst kleines .jar file zu haben.

### Source-Code
* Der Code ist fast unverändert zum alten Projekt
* Initbean für Testdaten
* 2 Entities - Car & RentLocation
* Via Rest aufrufbar

## Benutzung
1. Das Projekt bauen mit maven. (mvn-package) Dadurch wird ein .war File (rent.war) und ein .jar File (rent-thorntail.jar) erstellt. 
2. Starten der Derby-DB. (.../startNetworkServer -noSecurityManager)
3. Projekt im Terminal starten. (java -jar rent-thorntail.jar)
4. Im Browser über die Schnittstellen zugreifen z.B.
	* http://localhost:8080/rs/rental/cars - Alle Autos ausgeben
	* http://localhost:8080/rs/rental/locations - Alle Standorte ausgeben
