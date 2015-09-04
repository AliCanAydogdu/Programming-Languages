
# R version of Defined array_Struct


# First you create vectors
names <- c("Enes", "Kemal", "Ergin", "Mehmet")
age <- c(21,12,34,56)
gpa <- c(1.2,3.4, 3.5, 2.7)
gradeLevel <- c("Freshman", "Sophomore", "Junior", "Senior")

# Then merge all these vectors into one Data Frame
studentData <- data.frame(names, age, gpa, gradeLevel)

# To Print 
studentData

# To see the structure of the data
str(studentData)