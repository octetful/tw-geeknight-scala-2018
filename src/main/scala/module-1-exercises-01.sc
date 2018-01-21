val countryToCityMapper = (countries: List[String]) => {
  countries.map((c:String) => {
    if ( c == "India" ) "New Delhi"
    else if ( c == "USA" ) "Washington DC"
    else if ( c == "France" ) "Paris"
    else if ( c == "UK" ) "London"
  })
}

countryToCityMapper(List("USA", "India"))



case class SphericalCoordinates(r: Double, p: Double, t: Double)

case class CartesianCoordinates(x:Double, y: Double, z: Double)

val sphericalToCartesian = (scm: List[SphericalCoordinates]) => {
  scm.map(sc => {
    val x = sc.r * math.sin(sc.p) * math.cos(sc.t)
    val y = sc.r * math.sin(sc.p) * math.sin(sc.t)
    val z = sc.r * math.cos(sc.p)
    CartesianCoordinates(x, y, z)
  })
}

sphericalToCartesian(List(SphericalCoordinates(12.0, 4.5, 6.4), SphericalCoordinates(5.6, 4.5, 4.4)))


case class Cartesian2DCoordianates(x: Double, y: Double)

val getOnlyNECoords = (coords:List[Cartesian2DCoordianates]) => {
  coords.filter(c => if (c.x > 0 && c.y > 0) true else false)
}

getOnlyNECoords(List(Cartesian2DCoordianates(-10, 2), Cartesian2DCoordianates(2,5)))


case class SensorReadings(temp: Double, press: Double)

val getInhospitableReadings = (readings:List[SensorReadings]) => {
  readings.filter(reading => {
    if (reading.temp > -40 && reading.temp < 40 && reading.press > 10 && reading.press < 20) true else false
  })
}

getInhospitableReadings(List(SensorReadings(-10, 20), SensorReadings(-400, 5), SensorReadings(30, 15)))