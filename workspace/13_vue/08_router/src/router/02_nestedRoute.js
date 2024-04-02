import {createRouter, createWebHistory} from 'vue-router';

import HomeView from '@/views/01_router/HomeView.vue';
import RootRouter from '../views/02_nestedRoute/RootRouter.vue';
import NestedHome from '@/views/02_nestedRoute/NestedHome.vue';
import NestedView from '@/views/02_nestedRoute/NestedView.vue';

const router = createRouter({
    history: createWebHistory(),
    routes: [
        {
            path: '/',
            component: HomeView
        },
        {
            path: '/nested',
            component: RootRouter,
            children: [
                {
                    path: "home",
                    component: NestedHome
                },
                {
                    path: "view",
                    component: NestedView
                }
            ]
        }
    ]
})

export default router;