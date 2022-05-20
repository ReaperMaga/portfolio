FROM node:16

ENV PORT 3000

# Create app directory
RUN mkdir -p /application
WORKDIR /application

# Installing dependencies
COPY package*.json /application
RUN yarn install

# Copying source files
COPY . /application

# Building app
RUN yarn build
EXPOSE 3000

# Running the app
CMD "yarn" "start"
