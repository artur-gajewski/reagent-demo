# Reagent demo

Reagent is a ClojureScript wrapper for React. It enables you to create React applications with ClojureScript which
transpiles your cljs code to native javascript React application.

This repository consists of Reagent application template containing routing and classes for components, actions and application state to get you started right away.

In this sample application, you will be able to:

- Use router to navigate to different pages.
- Render and remove a component based on onClick event.
- Create list of items from an input field.
- Filter a visible list based on input.
- Load a page with route parameter

#### Architecture

When you load the app, router matches requested uri to a page component. Matched route can also trigger actions.

All pages are state aware. Components use only passed properties and modify state by calling actions. 

Actions modify application state which propagates to all affected components.


               +-------------------------------------------+
               |                                           |
               |                                           +
    Core --+ Route --+ Page --+ Component --+ Action --+ State --+ 
                         +                                       | 
                         |                                       | 
                         +---------------------------------------+


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
