@Grab('com.github.groovy-wslite:groovy-wslite:1.1.3')

import wslite.rest.RESTClient
import wslite.rest.ContentType
import wslite.rest.RESTClientException

try {
  def client = new RESTClient('http://non-existing.example.com')
  def response = client.get(path: '/something', accept: ContentType.JSON) {
    type ContentType.JSON
  }
}
catch (RESTClientException rce) {
  println(rce.message)
}