@Grab('com.github.groovy-wslite:groovy-wslite:1.1.3')

import wslite.soap.SOAPClient

File file = new File('request.xml')
assert file.exists()

String url = 'http://localhost:9090/codenotfound/ws/helloworld'

def client = new SOAPClient(url)
Map requestParams = [ headers: [ Authorization: 'Basic Y29kZW5vdGZvdW5kOnA0NTV3MHJk' ] ]
def response = client.send(requestParams, file.text)

print response.text
assert 200 == response.httpResponse.statusCode
