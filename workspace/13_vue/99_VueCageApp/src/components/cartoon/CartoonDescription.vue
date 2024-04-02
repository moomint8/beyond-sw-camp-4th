
<template>
    <div class="description">
        <p>제작자 : <slot name="creator"></slot></p>
        <p>제작년도 : <slot name="year"></slot></p>
        <p>장르 : <slot name="genre"> </slot></p>
    </div>
</template>


<style scoped>
.description{
    border: 1px dotted;
    align-items: center;
    align-content: center;
    margin-top: 3px;
    margin-bottom: 3px;
}
</style>