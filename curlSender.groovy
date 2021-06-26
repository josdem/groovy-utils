if(!args) {
  print 'Missing directory to scan'
  return
}

def files = 0
def directory = args[0]


new File(directory).eachFile{

  def is = new File(it.path).newInputStream()
  is.eachLine {
    def result = "curl $it".execute().text
    println result
    files++
  }

  is.close()
  print "Processed files: $files"
}
