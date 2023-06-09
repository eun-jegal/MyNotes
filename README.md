<h1>My Notes</h1>
<p>📝 Notes App built with MVVM pattern using Jetpack Compose, Coroutines, Hilt and Room</p>
<br>

<!-- Screenshots -->
<p align="center">
  <img src="https://github.com/eun-jegal/MyNotes/assets/57670625/bf91a769-916b-42f7-b6b4-ba0bafbea5da" width="30%"/>
  &nbsp;                                                                                                                
  <img src="https://github.com/eun-jegal/MyNotes/assets/57670625/513ff979-a5e4-4a1a-9db1-14b3ee672639" width="30%"/>
  </p>
<br>

<!-- Tech Stack -->
<h2>Tech Stack</h2>
<ul>
<li>Minumum SDK Level: 21</li>
<li>100% Kotlin</li>
<li>Architecture
    <ul>
      <li><a href="https://developer.android.com/topic/architecture">MVVM Pattern</a>: Industry-recognized software architecure pattern supported by Google</li>
    </ul>
 </li>
<li><a href="https://developer.android.com/jetpack/compose/documentation">Jetpack Compose</a>: Modern toolkit for building Android user interfaces using a declarative programming model</li>
<li><a href="https://developer.android.com/jetpack/compose/state">ViewModel</a>: Exposes data streams as a state holder</li>
<li><a href="https://developer.android.com/training/dependency-injection/hilt-android">Hilt</a>: Dependency injection library built on top of Dagger benefit from the compile-time correctness, runtime performance, scalability, and Android Studio support </li>
<li><a href="https://developer.android.com/kotlin/coroutines">Coroutines</a>: Concurrency design pattern provided by Kotlin</li>
</ul>
<br>

<!-- Architecture -->
<h2>Architecture</h2>
<p>My Notes demonstrates MVVM architecture by separating multiple app components into two main layers - UI and Data. Following the core Android design principles, the app is scalable, maintainable and testable.</p>
<ul>
  <li>Architectural Principles</li>
    <ul>
      <li>Separations of concerns</li>
      <li>Drive UI from data models</li>
      <li>Single source of truth</li>
      <li>Unidirectional Data Flow</li>
   </ul>
</ul>
<p align="center">
   <img src="" width="85%"/>
</p>

<h3>Architecture Overview</h3>
<p>Pokedex App follows the unidirectional data flow by adapting architectural layering. The app responds accordingly to user events and update ui states.</p>

<h3>UI Layer</h3>
<p align="center">
   <img src="https://github.com/eun-jegal/MyNotes/assets/57670625/3210a029-9bdd-4c80-b56a-7b2e6c5f1500" width="85%"//>
</p>
<p>UI layer displays the application data and serves as the primary point for user interactions. Whenever the app data changes, the UI should update to reflect changes made by either user interaction or external input.</p>
<ul>
  <li>The main activity hosts the navigation controller and navigates through two screens - PokemonListScreen and PokemonDetailScreen depending on user interactions. </li>
  <li>PokemonListViewModel requests data to the data layer and PokemonListScreen updates UI observing states held by ViewModel.</li>
  <li>PokemonDetailViewModel is responsible for fetching pokemon details and updates states for PokemonDetailScreen.</li>
</ul>
<br>

<h3>Domain Layer</h3>
<p align="center">
   <img src="https://github.com/eun-jegal/MyNotes/assets/57670625/99c1c7f3-2e50-43e2-bac5-3e144834586b" width="65%"/>
</p>
<p>Domain layer is reponsible for containing application data and business logics. The data layer is consisted of repositories and data sources. It is important to keep each repository as a single source of truth.</p>
<ul>
  <li>PokemonRepository is a single source of truth and requests data from the remote data source.</li>
  <li>PokemonRepository requests network responses to PokeAPI server using Retrofit library.</li>
</ul>
<br>

<h3>Data Layer</h3>
<p align="center">
   <img src="https://github.com/eun-jegal/MyNotes/assets/57670625/e6682057-68cf-4999-ae71-08a8bcc124ce" width="65%"/>
</p>
<p>Data layer is reponsible for containing application data and business logics. The data layer is consisted of repositories and data sources. It is important to keep each repository as a single source of truth.</p>
<ul>
  <li>PokemonRepository is a single source of truth and requests data from the remote data source.</li>
  <li>PokemonRepository requests network responses to PokeAPI server using Retrofit library.</li>
</ul>
<br>

<!-- References -->
<h2>References</h2>
<p>This project was built to understand how to build a clean architecture Jetpack Compose app using differnt types of Android libraries.</p>
<li><a href="https://www.youtube.com/watch?v=v0of23TxIKc&list=PLQkwcJG4YTCTimTCpEL5FZgaWdIZQuB7m">Youtube Tutorial</a>: Step-by-step tutorial to build My Notes app</li>
