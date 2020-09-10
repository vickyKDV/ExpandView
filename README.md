[![Release](https://jitpack.io/v/vickyKDV/ExpandView.svg)](https://jitpack.io/#vickyKDV/ExpandView)

# Expand View
Library Expand & Collapse View

![alt text](https://drive.google.com/file/d/1o9hDiX4CCQsTVxAKgPNA-QVB_YACoDdI/view?usp=sharing)


### Implementation
    allprojects {
            repositories {
                ...
                maven { url 'https://jitpack.io' }
            }
        }
    
    dependencies {
	        implementation 'com.github.vickyKDV:ExpandView:Tag'
	}

### How to Used
    final FloatingActionButton fab = findViewById(R.id.fab);
    fab.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
           final TextView textView = findViewById(R.id.textView);
           ExpandView.ExpandInit(textView,fab);
            }
          });
        
        
   ### Code by vickykdv (https://github.com/vickyKDV) 
