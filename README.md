[![Release](https://jitpack.io/v/User/Repo.svg)]
(https://jitpack.io/#vickyKDV/ExpandView)

# Expand View
Library Expand & Collapse View

### How to Used
    allprojects {
            repositories {
                ...
                maven { url 'https://jitpack.io' }
            }
        }
    
    dependencies {
	        implementation 'com.github.vickyKDV:ExpandView:Tag'
	}

### Implementation
    final FloatingActionButton fab = findViewById(R.id.fab);
    fab.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
           final TextView textView = findViewById(R.id.textView);
           ExpandView.ExpandInit(textView,fab);
            }
          });
        
        
   ### Code by vickykdv (https://github.com/vickyKDV) 
