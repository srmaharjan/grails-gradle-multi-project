package gplugin

import grails.boot.*
import grails.boot.config.GrailsAutoConfiguration


class Application extends GrailsAutoConfiguration {
    static void main(String[] args) {
        GrailsApp.run(Application, args)
    }
}