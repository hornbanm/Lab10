class Cookie {
  int numCookies;
  int bakeTemp;
  int bakeMinutes;
  boolean isReady;

  Cookie() {
    numCookies = 0;
    bakeTemp = 0;
    bakeMinutes = 0;
    isReady = false;
  }
  Cookie (int aNumCookies, int aBakeTemp, int aBakeMinutes) {
    numCookies = aNumCookies;
    bakeTemp = aBakeTemp;
    bakeMinutes = aBakeMinutes;

    isReady = false;
  }

  boolean getIsReady() {
    return isReady;
  }

  void setNumCookies(int aNumCookies) {
    numCookies = aNumCookies;
  }

  void bakeCookies (int aBakeTemp, int aBakeMinutes) {
    System.out.println("The cookies were baked at " + aBakeTemp + " degrees F for " + aBakeMinutes + " minutes.");

    isReady = true; 
  }
}