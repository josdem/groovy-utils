@Grab('com.github.groovy-wslite:groovy-wslite:1.1.3')

import wslite.rest.RESTClient

def client = new RESTClient("https://webflux.josdem.io/categories/en")
def response = client.get()

print response.dump()
assert 200 == response.statusCode
