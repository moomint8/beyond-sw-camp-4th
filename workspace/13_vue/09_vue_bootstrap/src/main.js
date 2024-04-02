import { createApp } from 'vue'
import App from './App.vue'

// bootstrap과 bootstrap-vue-3 insert 구문: 
// npm install vue bootstrap bootstrap-vue-3
import BootstrapVue3 from 'bootstrap-vue-3';
// import { BCalendar } from 'bootstrap-vue'


import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue-3/dist/bootstrap-vue-3.css'


// createApp(App).mount('#app')
const app = createApp(App)
app.use(BootstrapVue3)
// app.component('b-calendar', BCalendar)
app.mount('#app')
