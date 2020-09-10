# Expand View
Library Expand & Collapse View

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
