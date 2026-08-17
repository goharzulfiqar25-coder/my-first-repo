students = []


# Add Student
def add_student():
    print("\n===== Add Student =====")

    name = input("Enter student name: ")
    age = input("Enter student age: ")
    course = input("Enter course: ")
    marks = float(input("Enter marks: "))

    student = {
        "name": name,
        "age": age,
        "course": course,
        "marks": marks
    }

    students.append(student)

    print("\nStudent added successfully!")


# Show All Students
def show_students():
    print("\n===== All Students =====")

    if len(students) == 0:
        print("No students found.")
        return

    for i, student in enumerate(students, start=1):
        print(f"\nStudent {i}")
        print("Name   :", student["name"])
        print("Age    :", student["age"])
        print("Course :", student["course"])
        print("Marks  :", student["marks"])


# Search Student
def search_student():
    print("\n===== Search Student =====")

    name = input("Enter student name: ")

    found = False

    for student in students:
        if student["name"].lower() == name.lower():
            print("\nStudent Found!")
            print("Name   :", student["name"])
            print("Age    :", student["age"])
            print("Course :", student["course"])
            print("Marks  :", student["marks"])

            found = True
            break

    if not found:
        print("Student not found.")


# Update Student
def update_student():
    print("\n===== Update Student =====")

    name = input("Enter student name to update: ")

    for student in students:
        if student["name"].lower() == name.lower():

            print("\nStudent found!")

            student["name"] = input("Enter new name: ")
            student["age"] = input("Enter new age: ")
            student["course"] = input("Enter new course: ")
            student["marks"] = float(input("Enter new marks: "))

            print("\nStudent updated successfully!")
            return

    print("Student not found.")


# Delete Student
def delete_student():
    print("\n===== Delete Student =====")

    name = input("Enter student name to delete: ")

    for student in students:
        if student["name"].lower() == name.lower():

            students.remove(student)

            print("\nStudent deleted successfully!")
            return

    print("Student not found.")


# Main Program
while True:

    print("\n===================================")
    print("     STUDENT MANAGEMENT SYSTEM")
    print("===================================")

    print("1. Add Student")
    print("2. Show All Students")
    print("3. Search Student")
    print("4. Update Student")
    print("5. Delete Student")
    print("6. Exit")

    choice = input("\nEnter your choice: ")

    if choice == "1":
        add_student()

    elif choice == "2":
        show_students()

    elif choice == "3":
        search_student()

    elif choice == "4":
        update_student()

    elif choice == "5":
        delete_student()

    elif choice == "6":
        print("\nThank you for using Student Management System!")
        break

    else:
        print("\nInvalid choice! Please enter 1-6.")