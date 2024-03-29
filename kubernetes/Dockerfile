# specify base IMAGE from docker to use
# FROM BASE_IMAGE_NAME
FROM openjdk:17

# NB (RUN)
# - command are for IMAGES only
# - my image can have many RUN commands
# Create a new app directory for my application files in my image
# this creates a directory that lives inside my (image)container not my host machine
RUN mkdir /appDir

# copy the app files from my host machine into image filesystem
# NB (COPY)
# - the first argument applies to the host machine where the class file is located i.e. output/production....
# - the second argument applies to the image directory to copy to/keep the files
COPY ../../js/out/production/js /appDir

# Set the directory for executing future commands
WORKDIR /appDir

# NB (CMD)
# - set the command that will execute when you start the container from the image
# - your Dockerfile must contain 1 command or entry point instruction specifying the default instruction fot your container to start from
# - i.e. run the Main class when the container starts
# - therefore run the same command you would have run if you were trying to run the class from the terminal
# CMD java CLASS_NAME
# Run the lectures.Main class
CMD java lectures.Main

# Notes
# This file basically says:
# Pull an OpenJDK image
# Then copy my application files into the image
# And run the application when the container starts

#INORDER TO BUILD YOUR IMAGE, RUN THE COMMAND BELOW
# docker build -t IMAGE_NAME:TAG_NUMBER DOCKERFILE_LOCATION_PATH or USE(DOT . ) if already in the same folder/directory

# NB
# ../ - this means go out one level
# ../../ - this means go out two levels
#
# DIRECTORY_NAME/ - this means go in one level
# DIRECTORY_NAME/DIRECTORY_NAME/ - this means go in two level