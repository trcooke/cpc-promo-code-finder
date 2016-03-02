CPC Farnell - Promotional Code Finder
=====================================

Finds special promotional codes for products on http://cpc.farnell.com/

Pre-requisites
--------------

[Install Groovy](http://groovy-lang.org/install.html).

Usage example:
--------------

You want to buy a floodlight, say: http://cpc.farnell.com/pro-elec/jfx03-p1w30/led-floodlight-slim-30w/dp/LA05790

The Order Code is LA05790. Plug that into the groovy script and find any special discount codes for that product.

	$ groovy cpc-prices.groovy LA05790

Which yields the output

	Special codes for LA05790
	...o..ooo..........o.....o................................o..o..o......................o............o
	Results, cheapest first:
	LA0579006:£13.85
	LA0579025:£13.85
	LA0579058:£13.85
	LA0579064:£13.85
	LA0579087:£13.85
	LA0579003:£15.94
	LA0579008:£15.94
	LA0579061:£15.94
	LA0579007:£16.50
	LA0579019:£16.50
	LA05790:£19.74
	$

So this product costs £19.74 normally. But look! There’s a bunch of codes, such as LA0579006, that’ll get you the same thing for £13.85. Winner!