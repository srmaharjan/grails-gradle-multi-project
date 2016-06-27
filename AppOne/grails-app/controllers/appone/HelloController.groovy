package appone

import com.test.Test
import grails.plugins.export.ExportService

class HelloController {
    def exportService

    def index() {
        Test.print("test message...")
        render "AppOne Hello World!!..!!!..."
    }
}
