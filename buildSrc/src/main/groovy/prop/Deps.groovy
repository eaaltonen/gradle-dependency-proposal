package prop

import groovy.lang.Closure
import java.util.regex.Pattern

class Deps {
    def api = []
    def implementation = []
    def testImplementation = []
    
    def api(dep) {
        api << dep
    }
    
    def implementation(dep) {
        implementation << dep
    }
    
    def testImplementation(dep) {
        testImplementation << dep
    }
    
    def depChars = '[[a-zA-Z[0-9][.-]]]'
    
    Pattern groupArtifact = ~/${depChars}*:${depChars}*:/
    
    def filterLatest(list) {
        def result = []
        for (dep in list) {
            if (dep instanceof String) {
                def r = (dep =~ groupArtifact)[0]
                result << r+'+' // Get the latest version
            }
        }
        return result
    }
    
    def useLatest() {
        api = filterLatest(api)
        implementation = filterLatest(implementation)
        testImplementation = filterLatest(testImplementation)
    }
}
