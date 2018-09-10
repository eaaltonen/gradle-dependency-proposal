package prop

import groovy.lang.Closure

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
}
