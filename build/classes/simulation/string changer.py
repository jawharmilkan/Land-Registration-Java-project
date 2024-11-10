import os

def change_string(directory):
  """Change the given string in all of the files in the given directory.

  Args:
    directory: The directory to search for files.
  """

  global name
  search_string = input("Enter the string to search for: ")
  replace_string = input("Enter the string to replace with: ")

  for file in os.listdir(directory):
    path = os.path.join(directory, file)
    if os.path.isfile(path):
      with open(path, "r") as f:
        content = f.read()
        content = content.replace(search_string, replace_string)
      with open(path, "w") as f:
        f.write(content)

"""if name == "__main__":
 """
directory = "C:/Users/Unknown/Downloads/project rename test/demo-for-land-main/src/simulation"
if os.path.isdir(directory):
    change_string(directory)
else:
    print("The directory does not exist.")
