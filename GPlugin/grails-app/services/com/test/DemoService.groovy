package com.test

import grails.plugins.export.ExportService

/**
 * Created by srmaharjan on 3/28/14.
 */
class DemoService {

    ExportService exportService;

    def print() {
        println "TestService"
    }

    def printEXS() {
        println "exportService = $exportService"
    }

}

