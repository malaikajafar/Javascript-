<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Your JavaScript Program</title>
</head>
<body>

  <!-- Your JavaScript code goes here -->
  <script>
  const containerStyle = {
    width: 1479,
    height: 3390,
    position: 'relative',
    background: '#2BB6D2'
  };
  
  const viewAllButtonStyle = {
    left: 1138,
    top: 994,
    position: 'absolute',
    color: '#EF0B0B',
    fontSize: 45,
    fontFamily: 'Bevan',
    fontStyle: 'italic',
    fontWeight: '400',
    wordWrap: 'break-word'
  };
  
  const novelImagesStyle = [
    { width: 302, height: 357, left: 107, top: 1094, position: 'absolute' },
    { width: 295, height: 357, left: 568, top: 1094, position: 'absolute' },
    { width: 301, height: 357, left: 1027, top: 1094, position: 'absolute' }
    // Add more image styles as needed
    ];

// Repeat the pattern for other elements...

// Applying styles to elements
const containerDiv = document.createElement('div');
Object.assign(containerDiv.style, containerStyle);

const viewAllButtonDiv = document.createElement('div');
Object.assign(viewAllButtonDiv.style, viewAllButtonStyle);
viewAllButtonDiv.innerText = 'View all';

containerDiv.appendChild(viewAllButtonDiv);

novelImagesStyle.forEach((imgStyle) => {
  const img = document.createElement('img');
  Object.assign(img.style, imgStyle);
  img.src = 'https://via.placeholder.com/' + imgStyle.width + 'x' + imgStyle.height;
  containerDiv.appendChild(img);
});

// Repeat the pattern for other elements...

// Append the containerDiv to the document body or another parent element
document.body.appendChild(containerDiv);
const container = document.createElement('div');
container.style.width = '1431px';
container.style.height = '3390px';
container.style.position = 'relative';
container.style.background = '#2BB6D2';

// Add more styling and elements as needed...

document.body.appendChild(container);
const mainContainer = document.createElement('div');
mainContainer.style.width = '1436px';
mainContainer.style.height = '3439px';
mainContainer.style.position = 'relative';
mainContainer.style.background = '#2BB6D2';

// Adding sub-elements
const grayBackground1 = createDivWithStyles('1431px', '266px', '0', '0', '#D9D9D9');
mainContainer.appendChild(grayBackground1);

const messageContainer = createDivWithStyles('1431px', 'auto', '159px', '81px', 'transparent');
messageContainer.style.color = 'black';
messageContainer.style.fontSize = '45px';
messageContainer.style.fontFamily = 'Bevan';
messageContainer.style.fontStyle = 'italic';
messageContainer.style.fontWeight = '400';
messageContainer.style.wordWrap = 'break-word';
messageContainer.innerHTML = 'Dear Customer, Kindly keep your number <br/>active until you receive your parcel.';
mainContainer.appendChild(messageContainer);

// Add more elements following the pattern...

document.body.appendChild(mainContainer);

// Helper function to create div elements with styles
function createDivWithStyles(width, height, left, top, background) {
  const element = document.createElement('div');
  element.style.width = width;
  element.style.height = height;
  element.style.left = left;
  element.style.top = top;
  element.style.position = 'absolute';
  element.style.background = background;
  return element;
}
</script>
</body>
</html>