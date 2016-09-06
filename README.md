# Reagent demo

Reagent is a ClojureScript wrapper for React. It enables you to create React applications with ClojureScript which
transpiles your cljs code to native javascript React application.

This repository consists of Reagent application template containing routing and classes for components, actions and application state to get you started right away.

#### Requirements

1. Install Leiningen
2. Install Java SDK 8 or later

#### Code with hot reloading

    $ lein figwheel

#### Open browser to run this demo

http://localhost:3449

#### Create self-contained package

    $ lein uberjar
    
    $ java -jar reagent-demo.jar    

Fire up your browser at http://localhost:3000 and kaboom!

#### More information

https://reagent-project.github.io
