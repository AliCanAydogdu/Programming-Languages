# I used vectors like lists/arrays here
quicksort <- function(vec) {
  
  if(length(vec) > 1) {
    
    pivot <- vec[1]
    
    low <- quicksort(vec[vec < pivot])
    mid <- vec[vec == pivot]
    high <- quicksort(vec[vec > pivot])
    
    c(low, mid, high)  
  }
  
  else vec
}

example_vector = c(8,3,2,1,9,4,7,10,5,6)
quicksort(example_vector)
