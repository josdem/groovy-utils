@Grab('com.github.groovy-wslite:groovy-wslite:1.1.3')

import wslite.rest.RESTClient

def client = new RESTClient("http://localhost:8080/persons/")
def response = client.put(headers:["Content-Type":"application/json"]){
    json: ["nickname":"josdem","email":"jose.morales@dominos.com"]
}

print response.dump()
assert 200 == response.statusCode
