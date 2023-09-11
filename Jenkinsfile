node {
	stage ('SCM checkout'){
		git "https://github.com/mojo23tms/AutomationTestProjGradle"
		}
	stage ('Build'){
    	dir("tests") {
	   sh "gradle build"
       }
       	dir("tests/java/selenium") {
	   sh "java -jar com.test-1.0-SNAPSHOT.jar"
       }
		}
}