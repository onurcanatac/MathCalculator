quizSum = float (input("Quiz Sum: "))
HwSum = float (input("Homework Sum: "))
midtermGrade = float (input("Midterm Grade: "))

sum = quizSum + HwSum + midtermGrade * (2/5)

def findNeededPoints(letterGrade, borderOfGrade, sum):
    print("For",letterGrade,"you need",(borderOfGrade - sum) * 2.5,"points in the final exam.")

findNeededPoints("D",30,sum)
findNeededPoints("D+",40,sum)
findNeededPoints("C-",45,sum)
findNeededPoints("C",50,sum)
findNeededPoints("C+",55,sum)
findNeededPoints("B-",60,sum)
findNeededPoints("B",65,sum)
findNeededPoints("B+",70,sum)
findNeededPoints("A-",75,sum)
findNeededPoints("A",80,sum)