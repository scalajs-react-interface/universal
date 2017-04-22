package sri.universal

trait SriPlatform {
  def isAndroid: Boolean
  def isIOS: Boolean
  def isWeb: Boolean
}
