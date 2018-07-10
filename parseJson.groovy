git branch: 'master', credentialsId: '89af51cf-1cc3-452b-8dd6-c057f600ac18', url: 'https://github.com/juliencastelneau/JksPipeline.git'


// Methods in this file will end up as object methods on the object that load returns.
def parseJSON() {
    dir ('.')
    {
        def json_file = readJSON file: 'config.json'
        return json_file
    }
}

return this;