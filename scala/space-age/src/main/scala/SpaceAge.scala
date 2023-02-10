/**
  * Given an age in seconds, calculate how old someone would be on:
  * Mercury: orbital period 0.2408467 Earth years
  * Venus: orbital period 0.61519726 Earth years
  * Earth: orbital period 1.0 Earth years, 365.25 Earth days, or 31557600 seconds
  * Mars: orbital period 1.8808158 Earth years
  * Jupiter: orbital period 11.862615 Earth years
  * Saturn: orbital period 29.447498 Earth years
  * Uranus: orbital period 84.016846 Earth years
  * Neptune: orbital period 164.79132 Earth years
  */
object SpaceAge{
  val earthYearInSeconds = 31557600
  def onEarth(ageInSeconds: Double): Double = ageInSeconds / earthYearInSeconds

  val mercuryYearInEarthYears = 0.2408467
  def onMercury(ageInSeconds: Double): Double = onEarth(ageInSeconds = ageInSeconds) / mercuryYearInEarthYears

  val venusYearInEarthYears = 0.61519726
  def onVenus(ageInSeconds: Double): Double = onEarth(ageInSeconds = ageInSeconds) / venusYearInEarthYears

  val marsYearInEarthYears = 1.8808158
  def onMars(ageInSeconds: Double): Double = onEarth(ageInSeconds = ageInSeconds) / marsYearInEarthYears

  val jupiterYearInEarthYears = 11.862615
  def onJupiter(ageInSeconds: Double): Double = onEarth(ageInSeconds = ageInSeconds) / jupiterYearInEarthYears

  val saturnYearInEarthYears = 29.447498
  def onSaturn(ageInSeconds: Double): Double = onEarth(ageInSeconds = ageInSeconds) / saturnYearInEarthYears

  val uranusYearInEarthYears = 84.016846
  def onUranus(ageInSeconds: Double): Double = onEarth(ageInSeconds = ageInSeconds) / uranusYearInEarthYears

  val neptuneYearInEarthYears = 164.79132
  def onNeptune(ageInSeconds: Double): Double = onEarth(ageInSeconds = ageInSeconds) / neptuneYearInEarthYears
}
