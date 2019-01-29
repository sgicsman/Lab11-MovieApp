package Lab11Movies;

public class Movie {


		private String title;
		private String category;
		
		// constructors 
		public Movie () {	
		}
		
		public Movie(String title, String category) {
			this.title = title;
			this.category = category;	
		}
		
		//getters
		public String getTitle() {
			return title;
		}
		
		public String getCategory() {
			return category;
		}
		
		
		// setters
		public void setTitle(String title) {
			this.title = title;
		}
		
		public void setCategory(String category) {
			this.category = category;
		}
		
		//??
		@Override
		public String toString() {
			return ("\"" + title + "\" is in the " + category + " category." );
		}
		
}
