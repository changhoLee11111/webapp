// let div1 = document.createElement('div');
// let img1 = document.createElement('img');
// img1.setAttribute('src', 'images/pic1.jpg');
// div1.append(img1);
// let div2 = document.createElement('div');
// let img2 = document.createElement('img');
// img2.setAttribute('src', 'images/pic1.jpg');
// div2.append(img2);
// let div3 = document.createElement('div');
// let img3 = document.createElement('img');
// img3.setAttribute('src', 'images/pic1.jpg');
// div3.append(img3);
// let div4 = document.createElement('div');
// let img4 = document.createElement('img');
// img4.setAttribute('src', 'images/pic1.jpg');
// div4.append(img4);

let bdy = document.getElementById('bdy');

for (let i = 0; i < 4; i++) {
    let div = document.createElement('div');
    div.setAttribute('class', 'v' + (i + 1));
    let img = document.createElement('img');
    img.setAttribute('src', 'images/pic1.jpg');
    div.append(img);

    bdy.append(div);
}

let diva = document.createElement('div');
diva.setAttribute('class', 'row');
let ul = document.createElement('ul');
ul.setAttribute('id', 'first');
for (let i = 0; i < 3; i++) {
    let li = document.createElement('li');
    li.innerHTML = 'menu' + (i + 1);
    ul.append(li);
}
let ol = document.createElement('ol');
ol.setAttribute('id', 'last');
for (let i = 0; i < 3; i++) {
    let li = document.createElement('li');
    li.innerHTML = 'sub' + (i + 1);
    ol.append(li);
}
diva.append(ul, ol);
bdy.append(diva);