import groovy.json.JsonSlurper 
import groovy.json.JsonOutput 
import groovy.json.JsonBuilder


    def json_content = new JsonBuilder()
    
    
    def root = json_content "name":"srinivas","mb":"98"  

    def jsonSlurper = new JsonSlurper()


   def num = 1
   
    def contextJson = jsonSlurper.parseText('{"id":"1"}')
    def locJson = jsonSlurper.parseText('{"loc":"Hyderabad"}')


    root << contextJson
    
    root << locJson
    
    root << [pin:num]
    
    def sal = 100
    
    root << ["salary" :   sal]
    
    if(1 == 1)
        root << [ "temp" : "epjf" ]
        
   def addressJson = new JsonBuilder()
   addressJson = json {
   name , name }
   
   println(addressJson.toString())
    
    