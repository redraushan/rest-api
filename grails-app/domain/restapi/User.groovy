package restapi


import grails.rest.*

@Resource(readOnly = false, formats = ['json', 'xml'])
class User {

	String name

}
