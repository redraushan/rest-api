import restapi.*
class BootStrap {

    def init = { servletContext ->

	if(User.count()<= 1){
		new User(name:"Raushan").save()
	}
    }
    def destroy = {
    }
}
