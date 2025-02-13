A list of Test Cases

A subset of the Student User Stories
Create Question
As a Student, I want to create a new question so that I can ask for clarifications.
Acceptance Criteria:
Input has to include a non-empty question text.
If the question text is empty, display an error message: "Question cannot be empty".
Read Questions
As a Student, I want to view all available questions so that I can read the discussion topics.
Acceptance Criteria:
The system displays all stored questions in a list.
If no questions exist, the system displays "No questions available."
Update Question
As a Student, I want to edit a previously added question so that I can fix or clarify it.
Acceptance Criteria:
The system updates the question text if the new text is non-empty.
If the new text is empty, display an error message "Update failed: question cannot be empty."
Delete Question
As a Student, I want to delete a specific question so that I can remove outworn or incorrect topics.
Acceptance Criteria:
The selected question is removed from the list of questions.
If the question does not exist, display an error message "Question not found."
Create Answer
As a Student, I want to create a new answer for a given question so that I can propose a possible solution or response.
Acceptance Criteria:
Input must include a non-empty answer text.
If the text is empty, display an error message.
List Answers
As a Student, I want to see all answers for a given question so that I can understand the discussion context.
Acceptance Criteria:
If the question has no answers, display "No answers yet."
A list of Test Cases
TC1: Create Question
Positive Test: Provide a valid question text (e.g., "What is polymorphism in OOP?").
Expected: Question is created and stored successfully.
Negative Test: Provide an empty question text.
Expected: Error message "Question cannot be empty" is displayed, question not stored.
TC2: Read All Questions

Positive Test: At least one question exists.
Expected: System displays a list of question IDs and texts.
Negative Test: No questions exist.
Expected: System displays "No questions available."
TC3: Update Question
Positive Test: Provide a valid question ID and a new non-empty text.
Expected: The question text is updated.
Negative Test: Provide a valid question ID but an empty new text.
Expected: Error message "Update failed: question cannot be empty."
Negative Test (invalid ID): Provide a question ID that does not exist.
Expected: Error message "Question not found."





UML Class and Sequence Diagrams



Information for Grader to access the GitHub, the Source Code, and ReadMe
Github for source code and ReadMe: https://github.com/naljubur/hw2.git


HW2 Screencast
Information for Grader to access the GitHub, the Screencast, and ReadMe
 Screencast zoom: https://asu.zoom.us/rec/share/eeNQIYSqcbHPFKeWTcAxKRvr2tEe1vPTq8Z_0NhyyCKtZkGc7D9RVaw--9BDVfgt.dpj04ZYuId1Oq4Hg
Passcode for zoom: &w#z9B9%
Github
https://github.com/naljubur/hw2.git
