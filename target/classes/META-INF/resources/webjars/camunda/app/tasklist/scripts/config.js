window.camTasklistConf = {
  // change the app name and vendor
  // app: {
  //   name: 'Todos',
  //   vendor: 'Company'
  // },
  //
  // configure the date format
  // "dateFormat": {
  //   "normal": "LLL",
  //   "long":   "LLLL"
  // },
  //
  locales: {
    availableLocales: ['en', 'de', 'es'],
    fallbackLocale: 'es',
  },
  //
  // // custom libraries and scripts loading and initialization,
  // // see: http://docs.camunda.org/guides/user-guide/#tasklist-customizing-custom-scripts
  customScripts: {
    //   // AngularJS module names
    ngDeps: ['ui.bootstrap'],
    //   // RequireJS configuration for a complete configuration documentation see:
    //   // http://requirejs.org/docs/api.html#config
    deps: ['loadReact', 'react', 'react-dom'],
    paths: {
      //     // if you have a folder called `custom-ui` (in the `scripts` folder)
      //     // with a file called `scripts.js` in it and defining the `custom-ui` AMD module
      //     'custom-ui': 'custom-ui/scripts'
      loadReact: 'scripts/react/loadReact',
      react: 'scripts/react/react',
      'react-dom': 'scripts/react/react-dom',
    },
  },
  // csrfCookieName: 'XSRF-TOKEN',
  // disableWelcomeMessage: true,

  shortcuts: {
    claimTask: {
      key: 'ctrl+alt+c',
      description: 'claims the currently selected task',
    },
    focusFilter: {
      key: 'ctrl+shift+f',
      description: 'set the focus to the first filter in the list',
    },
    focusList: {
      key: 'ctrl+alt+l',
      description: 'sets the focus to the first task in the list',
    },
    focusForm: {
      key: 'ctrl+alt+f',
      description: 'sets the focus to the first input field in a task form',
    },
    startProcess: {
      key: 'ctrl+alt+p',
      description: 'opens the start process modal dialog',
    },
  },
};
