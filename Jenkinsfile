node {
	stage ('SCM checkout'){
		git "https://github.com/mojo23tms/AutomationTestProjGradle"
		}
	stage ('Build'){
    	dir("comtest") {
	   sh "gradle build"
       }
       	dir("comtest/target") {
	   sh "java -jar com.test-1.0-SNAPSHOT.jar"
       }
		}
}