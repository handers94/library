import com.library.*
class BootStrap{
    def init = { servletContext ->
	def course1 = new Course( title: 'Interactive Media with Animation',
			code: 'IMA101',
			tutor: 'Joe Jojo',
			department: 'Computing',
			description: '''Lorem ipsum dolor sit amet, ad sea solum brute sensibus, te summo senserit vix, mel reque corpora vulptutate ei.''')


	if(!course1.save()){
			course1.errors.allErrors.each{ error ->
		printIn "An error occurred whilst creating course1: ${error}"
		}    
}
}
    def destroy = {
    }
}
