if ("${params.configuration}" == "release")
{
    git branch: 'master', credentialsId: 'c88d1aef-98c3-4992-a205-31c13e56f012', url: 'https://github.com/FBU-IHU-LIRYC/music-utilities.git'
}
else if ("${params.configuration}" == "juliencastelneau")
{
    git branch: 'master', credentialsId: '89af51cf-1cc3-452b-8dd6-c057f600ac18', url: 'https://github.com/juliencastelneau/music-utilities.git'
}

// Methods in this file will end up as object methods on the object that load returns.
def parseJSON() {
    dir ('jenkins-config-files')
    {
        def json_file = readJSON file: 'config.json'
        return json_file
    }
}

return this;