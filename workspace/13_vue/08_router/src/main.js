import {createApp} from 'vue'
import router from './router/01_router.js';
// import router2 from './router/02_nestedRoute.js';

import App from './App.vue'

/* router 설정을 하기 위해서는 다음과 같이 router를 등록해 주어야 한다.(use 활용) */
// createApp(App).use(router).mount('#app')
const app = createApp(App);

app.use(router);
// app.use(router2);

app.mount('#app');
