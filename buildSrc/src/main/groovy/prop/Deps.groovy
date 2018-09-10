package prop

import groovy.lang.Closure

class Deps {
    
    def api(dep) {
        println "api: "+dep
    }
    
    def implementation(dep) {
        println "implementation: "+dep
    }
    
    def testImplementation(dep) {
        println "testImplementation: "+dep
    }
}
