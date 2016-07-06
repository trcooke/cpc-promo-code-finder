println "Special codes for " + args[0]
def prices = [:]
for (int i = 0; i <= 100; i++) {
  def data
  def code = (i == 100) ? args[0] : args[0] + sprintf("%02d", i)
  try {
    data = new URL("http://cpc.farnell.com/a/a/a/dp/" + code).getText()
    print "o"
  } catch (FileNotFoundException fnfe) { 
    print "."
    continue
  } // Invalid code, ignore and move on.
  
  def lines = data.readLines()

  for (int j = 0; j < lines.size(); j++) {
    if (lines.get(j) =~ /<span class="price">/) {
      prices.put(code, new BigDecimal(lines.get(j + 1).trim().replace('£','')))
    }
  }
}
println " "
if (prices.size() == 0) {
  println "No special codes"
} else {
  println "Results, cheapest first:"
  prices.sort { it.value } each {
    println it.key + ":£" + it.value
  }
}
