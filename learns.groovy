import groovy.json.JsonBuilder
import groovy.json.JsonOutput
import groovy.json.JsonSlurper

 def json_content = new JsonBuilder()
 def mainObj = json_content  "siteType": "external", "userType": "external",
            "visibilityLocale": ["en_GLOBAL"], "visibilitySiteType": ["external"], "jobVisibility": ["external"]
            

    String jobUniqueIdentifier = "refNum,jobId,locale"
    StringBuilder builder = new StringBuilder()


    def uniqueValueObj = new JsonBuilder()

   String[] uniqueIds = jobUniqueIdentifier.split(",")
   
   def var  = "valueTemp"
   
    for (int i = 0 ; i< uniqueIds.length;i++) {
        builder.append("temp");
        def uniqueId = uniqueIds[i];
        
        if(i == 0)
            uniqueValueObj = uniqueValueObj "$uniqueId" : var
        else
            uniqueValueObj = (uniqueValueObj << ["$uniqueId" : var])
    }



   mainObj.uniqueKey = builder.toString()
   mainObj.uniqueValue = uniqueValueObj
    


   def jsonOutput = JsonOutput.toJson(mainObj)
         
         
     println(jsonOutput)
     