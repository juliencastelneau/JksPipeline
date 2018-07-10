def json_file
def configuration
node('music-ubuntu-1204-64') 
{
	 // Clean workspace
	deleteDir()

	stage('parseJSON') {
	    
	    echo '### Lets go to parse'
	    
	    def loadFile = load("parseJSON.groovy")

    	// Call the method we defined in externalMethod.
    	json_file = loadFile.parseJSON()
	    echo "${json_file.release.medinriapublic.branch}"
	} 
}

