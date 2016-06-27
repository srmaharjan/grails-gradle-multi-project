package apptwo

import com.test.DemoService

class Hello2Controller {
    def exportService
    DemoService demoService

    def index() {
        println "exportService = $exportService"
        demoService.print();
        demoService.printEXS();
        render "AppTwo Hello World!!...!! one  r"
    }


}
